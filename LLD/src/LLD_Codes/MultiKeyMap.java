package LLD_Codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Key<K1, K2> {
	public K1 key1;
	public K2 key2;

	public Key(K1 key1, K2 key2) {
		this.key1 = key1;
		this.key2 = key2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Key key = (Key) o;
		if (!Objects.equals(this.key1, key.key1)) {
			return false;
		}

		return Objects.equals(this.key2, key.key2);
	}

	@Override
	public int hashCode() {
		int result = key1 != null ? key1.hashCode() : 0;
		result = 31 * result + (key2 != null ? key2.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "[" + key1 + ", " + key2 + "]";
	}
}


class MultiKeyMap {
	public static void main(String[] args) {
		//  Create a `HashMap` with `Key` as key
		Map<Key, String> multiKeyMap = new HashMap<>();

		// [key1, key2] -> value1
		Key k12 = new Key("key1", "key2");
		multiKeyMap.put(k12, "value1");

		// [key3, key4] -> value2
		Key k34 = new Key("key3", "key4");
		multiKeyMap.put(k34, "value2");

		// print multikey map
		System.out.println(multiKeyMap);

		// print value corresponding to key1 and key2
		System.out.println(multiKeyMap.get(k12));
	}
}