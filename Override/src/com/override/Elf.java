package com.override;

public class Elf extends Monster {

	void attack(Player p) {

		attack = 7;
		So.ln(String.format("활로 %s에게 피해를 %d 줌", p.name, attack));
	}

	void plusPoisonDamage(Player p) {

		So.ln(String.format("%s에게 독데미지 %d를 추가로 줌", p.name, attack));
	}

}
