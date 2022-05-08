package day3;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {

	public static void main(String[] args) {
		
		List<Animal> list =new ArrayList<>();
		list.add(new Dog("john"));
		list.add(new Cat("Cat"));
		list.add(new Pig("pig"));
		list.add(new Pigeon("aaa"));
		list.add(new Eagle("bbb"));
		for(Animal a:list) {
			a.introduce();
			a.makeNoise();
			if(a instanceof Cat) {
				((Cat)a).sleep();
			}
			if(a instanceof Flyable) {
				((Flyable)a).Fly();
			}
		}
	}
}