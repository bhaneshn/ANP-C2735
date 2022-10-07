
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;


public class P74  implements Runnable {

int k = 0;

public P74(int i) {

this.k = i;

}

public static void main(String[] args)

{

new P74(2).run();

new P74(1).run();

}

public void run() {

for(int i=0; i<k; i++) {

System.out.println("run() method...");

}

}
}
