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
@DiscriminatorValue("bowler")
public class Bowlers extends Player {

	private String BowlingHand;
	private String BestFigures;
	
}