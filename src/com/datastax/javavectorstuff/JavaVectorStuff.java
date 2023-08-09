package com.datastax.javavectorstuff;

import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class JavaVectorStuff {

	static final VectorSpecies<Integer> INT_MAX_SPECIES = IntVector.SPECIES_MAX;
	static final VectorSpecies<Float> FLOAT_SPECIES = FloatVector.SPECIES_PREFERRED;
	
	public static void main(String[] args) {

		//int[] goAwayShirt = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
		//int[] yourFaceShirt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
		
		
		
		
		int[] intVector1 = {2, 3, 0, 1, 1, 1, 1, 0};
		int[] intVector2 = {1, 5, 8, 0, 4, 0, 1, 1};
		
		IntVector vector1 = IntVector.fromArray(INT_MAX_SPECIES, intVector1, 0);
		IntVector vector2 = IntVector.fromArray(INT_MAX_SPECIES, intVector2, 0);

		System.out.println("V1 = " + vector1);
		System.out.println("V2 = " + vector2);

		IntVector result = vector1.add(vector2);
		
		System.out.println("-----------------------------");
		System.out.println("Vs = " + result);
		
		System.out.println();
		
		int[] rogersville = {200, -567};
		int[] parktown = {-52, -348};
		
		IntVector rogersvilleVector = IntVector.fromArray(IntVector.SPECIES_64, rogersville, 0);
		IntVector parktownVector = IntVector.fromArray(IntVector.SPECIES_64, parktown, 0);
		
		System.out.println("rogersvilleVector = " + rogersvilleVector);
		System.out.println("parktownVector = " + parktownVector);

		IntVector coordinateSum = rogersvilleVector.add(parktownVector);

		System.out.println("rogersvilleVector + parktownVector = " + coordinateSum);
		System.out.println("coordinateSum " + (char)247 + " 2 = " + coordinateSum.div(2));

		
	}

}
