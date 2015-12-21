package org.istic.idm.xtext.utils

import java.util.HashMap

public class DistributedRandomNumberGenerator {
	HashMap<Integer, Double> distribution
	double distSum

	new() {
		distribution = new HashMap()
	}

	def void addNumber(int value, double distribution) {
		if (this.distribution.get(value) !== null) {
			distSum -= this.distribution.get(value)
		}
		this.distribution.put(value, distribution)
		distSum += distribution
	}

	def int getDistributedRandomNumber() {
		var double rand = Math.random()
		var double ratio = 1.0f / distSum
		var double tempDist = 0
		for (Integer i : distribution.keySet()) {
			tempDist += distribution.get(i)
			if (rand / ratio <= tempDist) {
				return i
			}

		}
		return 0
	}

}
