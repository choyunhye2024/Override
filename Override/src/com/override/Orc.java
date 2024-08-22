package com.override;

public class Orc extends Monster {

	void attack(Player p) {

		attack = 5;
		So.ln(String.format("몽둥이로 %s에게 피해를 %d 줌", p.name, attack));

	}

}
