import java.util.List;

/**
 * remove duclipcate consecutive item from any kind of list, this is in
 * homework3. Recursion topic.
 * 
 * @author Thitiwat Thongbor
 *
 */
public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list
	 * parameter. * For example, if list = { a, b, b, b, c, b, c, c} then after
	 * calling unique the list will contain {a, b, c, b, c}. Only consecutive
	 * duplicates are removed. Objects are compared using their own equals
	 * method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */
	public static List<Object> unique(List<Object> list) {
		if (list == null) {
			throw new IllegalArgumentException();
		}
		if (list.size() <= 1) {
			return list;
		}
		if (list.subList(1, 2).contains(list.get(0))) {
			list.remove(0);
			return unique(list.subList(0, list.size()));
		}
		return unique(list.subList(1, list.size()));
	}
}
