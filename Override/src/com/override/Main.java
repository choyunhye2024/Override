package com.override;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Player p = new Player("엠피스", 1000);

		ArrayList<Monster> ms = new ArrayList<>();
		ms.add(new Dragon());
		ms.add(new Dragon());
		ms.add(new Dragon());
		ms.add(new Orc());
		ms.add(new Orc());
		ms.add(new Orc());
		ms.add(new Orc());
		ms.add(new Orc());
		ms.add(new Orc());
		ms.add(new Orc());
		ms.add(new Orc());
		ms.add(new Elf());
		ms.add(new Elf());
		ms.add(new Elf());
		ms.add(new Elf());
		ms.add(new Elf());

		for (Monster m : ms) {
			m.attack(p);
		}

	}

}
