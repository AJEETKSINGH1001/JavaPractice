/*If you are aware of interprocess communication then it will be easy for you to understand interthread communication. 
Interthread communication is important when you develop an application where two or more threads exchange some information.
There are three simple methods and a little trick which makes thread communication possible. 
All the three methods are listed below */

/*1	
public void wait()

Causes the current thread to wait until another thread invokes the notify().

2	
public void notify()

Wakes up a single thread that is waiting on this object's monitor.

3	
public void notifyAll()

Wakes up all the threads that called wait( ) on the same object.*/

package java_practice;

class Chat {
	   boolean flag = false;

	   public synchronized void Question(String msg) {
	      if (flag) {
	         try {
	            wait();
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	      System.out.println(msg);
	      flag = true;
	      notify();
	   }

	   public synchronized void Answer(String msg) {
	      if (!flag) {
	         try {
	            wait();
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }

	      System.out.println(msg);
	      flag = false;
	      notify();
	   }
	}

	class T1 implements Runnable {
	   Chat m;
	   String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

	   public T1(Chat m1) {
	      this.m = m1;
	      new Thread(this, "Question").start();
	   }

	   public void run() {
	      for (int i = 0; i < s1.length; i++) {
	         m.Question(s1[i]);
	      }
	   }
	}

	class T2 implements Runnable {
	   Chat m;
	   String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

	   public T2(Chat m2) {
	      this.m = m2;
	      new Thread(this, "Answer").start();
	   }

	   public void run() {
	      for (int i = 0; i < s2.length; i++) {
	         m.Answer(s2[i]);
	      }
	   }
	}
	public class Interthread_communication {
	   public static void main(String[] args) {
	      Chat m = new Chat();
	      new T1(m);
	      new T2(m);
	   }
	}
