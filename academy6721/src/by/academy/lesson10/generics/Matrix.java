package by.academy.lesson10.generics;

import by.academy.lesson7.oop.deal.Product;

public class Matrix<T> {

	private T[] array;

	public Matrix(T[] array) {
		this.array = array.clone();
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public static void main(String[] args) {
		Matrix<Double> doubleMatrix = new Matrix<>(new Double[2]);
		Matrix<Double> doubleMatrix1 = new Matrix<>(new Double[2]);

		
		
		
		Matrix<Integer> integerMatrix = new Matrix<>(new Integer[4]);
		doubleMatrix = doubleMatrix1;

		Matrix<Byte> byteMatrix = new Matrix<>(new Byte[7]);
		Matrix<Product> productMatrix = new Matrix<>(new Product[7]);

	}
}