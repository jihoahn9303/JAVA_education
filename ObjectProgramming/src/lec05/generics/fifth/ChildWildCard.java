package lec05.generics.fifth;

public class ChildWildCard<T extends WildCard<?>> {

	ChildWildCard<WildCard<String>> childWildCardStr = new ChildWildCard<WildCard<String>>();
	ChildWildCard<WildCard<Integer>> childWildCardInt = new ChildWildCard<WildCard<Integer>>();
}
