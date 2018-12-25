/**
 * 
 */
package justdo.it.ocpjp8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * @author aposo
 *
 */
public class PredicateInterfaceExample {

	static class Data {
		int value;

		public Data(int x) {
			this.value = x;
		}

		public String toString() {
			return "" + value;
		}
	}

	static class MyFilter {
		public boolean test(Data d) {
			return d.value == 0;
		}
	}

	public static void filterData(ArrayList<Data> dataList, Predicate<Data> f) {
		Iterator<Data> i = dataList.iterator();
		while (i.hasNext()) {
			if (f.test(i.next())) {
				i.remove();
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Data> al = new ArrayList<Data>();
		Data d = new Data(1);
		al.add(d);
		d = new Data(2);
		al.add(d);
		d = new Data(0);
		al.add(d);
		filterData(al, (Data t) -> t.value == 0); // 1
		System.out.println(al);

	}

}
