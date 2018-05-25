package com.github.koda93.NettyNioServer;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class NioServer {
	public void server(int port) throws Exception {
		final ByteBuf buf = Unpooled.copiedBuffer("Hi!\r\n", Charset.forName("UTF-8"));
		EventLoopGroup group = new NioEventLoopGroup();
		// 논블로킹 모드를 위해 NioEventLoopGroup을 이용 
		try {
			ServerBootstrap b = new ServerBootstrap();
			// ServerBootstrap 생성 
			b.group(group).channel(NioServerSocketChannel.class)
				.localAddress(new InetSocketAddress(port))
				.childHandler(new ChannelInitializer<SocketChannel>() {
					// 연결이 수락될 때마다 호출될 ChannelIntializer를 지정 
					@Override
					public void initChannel(SocketChannel ch) throws Exception {
						ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
							// 이벤트를 가로채고 처리할 ChannelInboundHandlerAdapter를 추가 
							@Override
							public void channelActive(ChannelHandlerContext ctx) throws Exception {
								ctx.writeAndFlush(buf.duplicate())
								.addListener(ChannelFutureListener.CLOSE);
								// 클라이언트로 메세지를 출력하고 ChannelFutureListener를 추가해 
								// 메세지가 출력되면 연결을 닫음
							}
						});
					}
				});
			ChannelFuture f = b.bind().sync();
			// 서버를 바인딩해 연결을 수락 
			f.channel().closeFuture().sync();
		} finally {
			group.shutdownGracefully().sync();
			// 모든 리소스를 해제 
		}
	}
}