package com.kr.prospring5.ch3;

public class FtpArtworkSender implements ArtworkSender{

	@Override
	public void sendArtwork(String artworkPath, Recipient recipient) {
		// FTP로직 구현 AREA
		
	}

	@Override
	public String getFriendlyName() {
		// TODO Auto-generated method stub
		return "파일 전송 프로토콜";
	}

	@Override
	public String getShortName() {
		// TODO Auto-generated method stub
		return "ftp";
	}
	

}
