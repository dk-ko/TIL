package com.github.koda93.echo_client;
/*
 * 1. 서버로 연결 
 * 2. 메세지를 하나 이상 전송 
 * 3. 메세지마다 대기하고 서버로부터 동일한 메세지를 수신 
 * 4. 연결을 닫는다. 
 */

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

@Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf>{
	@Override 	// channelActive : 연결이 만들어지면 호출
	public void channelActive(ChannelHandlerContext ctx){
		// 채널 활성화 알림을 받으면 메세지를 전송
		ctx.writeAndFlush(Unpooled.copiedBuffer("Netty Start!", CharsetUtil.UTF_8));
	}
	
	@Override	// channelRead0 : 데이터가 수신될 때 마다 호출 
	public void channelRead0(ChannelHandlerContext ctx, ByteBuf in){
		// 수신한 메세지의 덤프를 로깅 
		System.out.println(
				"Client received: " + in.toString(CharsetUtil.UTF_8));
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause){
		// 예외 시 오류를 로깅하고 채널을 닫음 
		cause.printStackTrace();
		ctx.close();
	}
}
