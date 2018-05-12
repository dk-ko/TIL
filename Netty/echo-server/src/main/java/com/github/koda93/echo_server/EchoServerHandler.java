/*
 * 하나 이상의 ChannelHandler : 클라이언트로부터 받은 데이터를 서버측에서 처리하는 비즈니스 논리 구현
 * 부트스트랩 : 서버를 구성하는 시동 코드 구성, 연결요청을 수신하는 포트를 서버와 바인딩하는 코드 
 */
package com.github.koda93.echo_server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

@Sharable // ChannelHandler를 여러 채널간에 공유할 수 있음을 나타냄 
public class EchoServerHandler extends ChannelInboundHandlerAdapter{
// ChannelInboundHandler의 기본 구현을 제공하는 하위 클래스인 ChannelInboundHanlerAdapter 사용 
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg){
		// 수신한 데이터를 모두 처리해야해서 재정의 함 
		// 현재 프로그램은 단순히 받은 데이터를 다시 반향 출력 
		ByteBuf in = (ByteBuf) msg;
		System.out.println( // 메세지 콘솔 로깅 
				"Server received: " + in.toString(CharsetUtil.UTF_8));
		ctx.write(in); // 아웃바운드 메세지를 플러시하지 않은 채로 받은 메세지를 발신자로 출력 
	}
	
	@Override
	public void channelReadComplete(ChannelHandlerContext ctx){
		ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)
		.addListener(ChannelFutureListener.CLOSE);
		// 대기 중인 메세지를 원격 피어로 플러시하고 채널을 닫음 
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause){
		cause.printStackTrace(); // 예외 스택 추적을 출력 
		ctx.close(); // 채널 닫음 
	}
}
