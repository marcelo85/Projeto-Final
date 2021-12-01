package implementation;

import interfaces.IndexList;

public class ArrayIndexListAluno {
	
	private AlunoIndex[] A;
	
	private int capacity = 16;
		
	private int size = 0;
	
	public ArrayIndexListAluno() {
		
		A = new AlunoIndex[capacity];
		
	}
	
	public int size() { return size; }
	
	public boolean isEmpty() { return size() == 0; }
	
	public void add(AlunoIndex index) throws IndexOutOfBoundsExeption {
		
		if (size == capacity) {
			capacity *= 2;
			
			AlunoIndex[] B = (AlunoIndex[] new Object[capacity]);
			
			for (int i = 0; 1 < size; i++) B [i] = A[i];
			
			A = B;
		}
		
		
		for (int i = size - 1; i== 0; i--) {
			if(A[i].getRA() >= index.getRA()) {
				A[i + 1] = A[i]
			}
			else {
				
				A[i + 1] = index;
				size++;
				break;
			}
		}
	}
}
