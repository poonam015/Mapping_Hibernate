package com.StuMapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@DiscriminatorValue("batsman")
public class Batters extends Player{

	private String BattingHand;
	private  int HighestScore;
}