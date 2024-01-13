//garbage collection = destroying unused objects i.e automatically reclaiming the runtime unused memory
/*
 * this makes java memory efficient as the garbage collector removes the unreferenced objects from heap memory
 * automatically done by jvm
 * 
 * How can an object be unreferenced
 * 1. By nulling the reference
 * syntax 
 * Employee e = new Employee();
 * e = null
 * 
 * 2. By applying a referenace to another
 * syntax
 * Employee e1 = new Employee();
 * Employee e2 = new Employee();
 * e1 = e2 // this makes the the first object reffered by e1 available for garbage collection
 * 
 * 3. by anaonymous object 
 * synatax
 * new employee();
 * 
 * The finalize () method is invoked each time  before the object garbage is collected 
 * its used to perform cleanup processing
 * it is defined in an object class as:
 * protected void finalize();
 * 
 * the gc() method is used to invoke the garbage collector to perform cleanup 
 * defined as :
 * public static void gc(){}
 * Java performs garbage collecction as a Daemon thread called Garbage Collector GC
 * THis thread calls the finalze () method before an object is garbage collected
 * 
 */

 //program for garbage collection
public class GarbageCollection {
    public void finalize () {
        System.out.println("The object is garbage collected");
    }

    public static void main (String[] Args) {
        GarbageCollection s1 = new GarbageCollection();
        GarbageCollection s2 = new GarbageCollection();
        
        s1 = null;
        s2 = null;
        System.gc();
    }
}
