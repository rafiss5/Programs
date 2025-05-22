package modelo;

import estrutura.Aluno;

public class FilaAlunos {

	    private Aluno[] queue;
	    private int size;

	    public FilaAlunos() {
	        queue = new Aluno[5];
	        size = 0;
	    }

	    public void addEnd(Aluno student) {
	        if (size == queue.length) {
	            increaseCapacity();
	        }
	        queue[size] = student;
	        size++;
	    }

	    public void increaseCapacity() {
	        Aluno[] newQueue = new Aluno[queue.length * 2];
	        for (int i = 0; i < queue.length; i++) {
	            newQueue[i] = queue[i];
	        }
	        queue = newQueue;
	    }

	    public Aluno removeStart() {
	        if (size == 0) {
	            return null;
	        }
	        Aluno removed = queue[0];
	        for (int i = 0; i < size - 1; i++) {
	            queue[i] = queue[i + 1];
	        }
	        queue[size - 1] = null;
	        size--;
	        return removed;
	    }

	    public Aluno getStudent(String name) {
	        for (int i = 0; i < size; i++) {
	            if (queue[i].getName().equalsIgnoreCase(name)) {
	                return queue[i];
	            }
	        }
	        return null;
	    }

	    public Aluno getStudent(int index) {
	        if (index >= 0 && index < size) {
	            return queue[index];
	        }
	        return null;
	    }

	    public int getSize() {
	        return size;
	    }

	   
	    public String toString() {
	        String result = "";
	        for (int i = 0; i < size; i++) {
	            result += queue[i].toString() + "\n";
	        }
	        return result;
	    }
}
	
