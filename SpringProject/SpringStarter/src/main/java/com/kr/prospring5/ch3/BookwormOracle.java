package com.kr.prospring5.ch3;

public class BookwormOracle implements Oracle{

	private Encyclpedia encyclopedia;
	
	
	
	public void setEncyclopedia(Encyclpedia encyclopedia) {
		this.encyclopedia = encyclopedia;
	}



	@Override
	public String defineMeaningOfLife() {
		return "백과사전은 돈을 낭비합니다. 세계를 돌아 다니십시오.";
	}
	

}
