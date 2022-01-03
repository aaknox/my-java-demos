## Pokemon Comparable/Comparator Example

This example investigates sorting both by Comparable and Comparator interfaces. It uses a pokemon object at it's base in order to inspire associate interaction. 

**Topics:** Sorting with Comparable and Comparator, Collections utility class, Enhanced For loop, Lambdas, TreeSet/TreeMap creation and iteration.

**How to Teach:**

***Class Pokemon Setup***

1. Create a new Java Project. 

2. Create a class "Pokemon" in a new package.

3. Give the Pokemon class three private fields: type, id, and name. 
    ```java
    private String type;
	private int id;
	private String name;
    ```
4. Generate a no-args constructor and a constructor with all three fields. 

5. Generate getters and setters. 

6. Generate toString. 

***Create Data for Sorting***

1. Create a main method (provided here in Pokemon but may be created in a separate driver class.)

2. Create a new arrayList of Pokemon in main method. 
    ```java
    List<Pokemon> myPokemon = new ArrayList<>();
    ```

3. Add 8-10 new pokemon to the ArrayList. Ask associates for suggestions on pokemon to create. 
    ```java
	myPokemon.add(new Pokemon("Fire", 5, "Charmander"));
	myPokemon.add(new Pokemon("Electric", 13, "Electabuzz"));
	myPokemon.add(new Pokemon("Electric", 1000, "1Pikachu"));
	myPokemon.add(new Pokemon("Electric", 1000, "!Pikachu"));
	myPokemon.add(new Pokemon("Electric", 1000, "Pikachu"));
	myPokemon.add(new Pokemon("Grass", 1, "Bulbasaur"));
	myPokemon.add(new Pokemon("Psychic", 35, "Kadabra"));
	myPokemon.add(new Pokemon("Fighting", 34, "Mankey"));
	myPokemon.add(new Pokemon("Fighting", 36, "mankey"));
    ```
4. Make sure created pokemon have names that highlight the sorting of lowercase vs uppercase letters and special characters. Also that there are some pokemon of the same type and they are entered in the list so those of the same type are not already ordered by name. 

***Implement Comparable***

1. Implement Comparable<Pokemon> in the Pokemon class.  

2. Generate the unimplemented compareTo method. 
    ```java
    @Override
	public int compareTo(Pokemon o) {
		return 0;
	}
    ```
3. Explain how compareTo compares with positive vs negative vs zero return value. 

4. Change return statement to sort by id in ascending order. 
    ```java
    return this.getId()-o.getId();
    ```
5. Return to main method. Build and explain an enhanced for loop to iterate over the list and print the unsorted pokemon. 
    ```java
    for(Pokemon p : myPokemon) {
			System.out.println(p);
		}
    ```


6. Run as Java application to show unsorted list.  

***Comparable Sort by ID***

1. Above the Use Collection utility class to sort the list of pokemon. Explain the Collection class. 
    ```java
    Collections.sort(myPokemon);
    ```

2. Run again as Java application to show sorted list.

3. Comment out return statement in compareTo method. Add new return statement with values swapped to show descending order.
    ```java
    return o.getId()-this.getId() ;
    ```
4. Run again to show descending list. 

***Comparable Sort by Name***

1. Comment out most recent return statement and create a new return statement in the compareTo method to sort by name. Explain that Strings have their own compareTo method.
    ```java
    return this.getName().compareTo(o.getName());
    ```

2. Run again to show order by name. Show how all capital letters come before lowercase letters. Ask how to resolve this. (toLowerCase/toUpperCase)

3. Comment out current return statement and swap values so Strings will be sorted in descending value.

4. Run application to show result. 

***Comparator Sort by Type or ID***

1. Comment out compareTo and Comparable implementation in Pokemon class. 

2. Create new class Pokemon Helper that implements Comparator with the Pokemon generic.
    ```java
    public int compare(Pokemon p1, Pokemon p2) 
    ```
3. Create return statement that will sort by type. 
    ```java
    return p1.getType().compareTo(p2.getType());
    ```
4. In main method, add second argument to sort method that is a new PokemonHelper to use that Comparator to sort. 
    ```java
    Collections.sort(myPokemon, new PokemonHelper());
    ```
5. Run application to show sorting by type. Underline that no sorting is done of same type pokemon. 

6. In PokemonHelper, comment out the return statement. 

7. Add a new return statement to sort by id. Underline the need to use the two objects instead of a this statement when compared to Comparable's compareTo method. 
    ```java
    return p1.getId() - p2.getId();
    ```

8. Run application again to show new sorting.


***Comparator Sort by Type and Name***

1. Comment out current return statement in PokemonHelper. 

2. Create a new int "result" based on a type comparison between pokemon. 
    ```java
    int result = p1.getType().compareTo(p2.getType());
    ```

3. Create if statement conditional on result not being 0. (The pokemon are of different types.) And if true return result.
    ```java
    if (result != 0) {
		return result;
	}
    ```
4. Create new return statement after if statement in case the pokemon are the same type to sort by name. 
    ```java
    return p1.getName().compareTo(p2.getName());
    ```
5. Run the application to show new sorting by Type then Name. 

***Comparator Lambda Sorting***

1. In main method comment out current Collection.sort method. 

2. Create a new Collection.sort method that use a lambda comparator. Explain lambdas and how comparator is a functional interface. 
    ```java
    Collections.sort(myPokemon, (p1, p2) ->
    ```

3. Complete the lambda expression to sort by ID.
    ```java
    { return p1.getId() - p2.getId();}
    ```
4. Run application to show pokemon sorted by ID. 

***TreeSet with Comparable***

1. Comment out the code currently in the main method: myPokemon arrayList, Collection.sort, enhanced for loop etc. 

2. Explain a TreeSet and how it's values are sorted, requiring a sorting method. 

3. Build a String based TreeSet in the main method as an example for TreeSets with objects that have Comparable already implemented.
    ```java
    Set<String> myExampleTreeSet = new TreeSet<>();
    ```
4. Add 4-5 Strings to the set highlighting that will highlight the inherent sorting of the TreeSet. 
    ```java
    myExampleTreeSet.add("hello");
	myExampleTreeSet.add("1hello");
	myExampleTreeSet.add("Hello");
	myExampleTreeSet.add("world");
    ```
5. Build an enhanced for loop to print out the Strings in order. 
    ```java
    for(String s: myExampleTreeSet) {
	System.out.println(s);
	}
    ```
6. Run application to show the TreeSet's ordering of the Strings. 

***TreeSet with Comparator***

1.  Comment out all code related to the previous example Set in the main method. 

2. Create a new TreeSet of Pokemon in the main method that takes the PokemonHelper as it's Comparator.
    ```java
    Set<Pokemon> myPokemonSet = new TreeSet<>(new PokemonHelper());
    ```
3. Add 8-10 new Pokemon to the Set. Be sure to include at least one duplicate.
    ```java
    myPokemonSet.add(new Pokemon("Fire", 4, "Charizard"));
	myPokemonSet.add(new Pokemon("Dragon", 140, "Dragonite"));
	myPokemonSet.add(new Pokemon("Ghost", 35, "Gengar"));
	myPokemonSet.add(new Pokemon("Ghost", 35, "Gengar"));
	myPokemonSet.add(new Pokemon("Physic", 47, "Alakazam"));
	myPokemonSet.add(new Pokemon("Rock", 1500000, "Golem"));
	myPokemonSet.add(new Pokemon("Poison", 13, "Nidoking"));
	myPokemonSet.add(new Pokemon("Flying", 100, "Pidgeot"));
    ```
4. Create an enhanced for loop to print out all the Pokemon. 
    ```java
    for(Pokemon p : myPokemonSet) {
		System.out.println(p);
	}
    ```

5. Run application to show how the pokemon are ordered via the Comparator and that duplicate values do not exist.

***TreeMap with Comparable***

1. Comment out all code dealing with the previous TreeSet in the main method. 

2. In the main method, create a new TreeMap for pokemon trainers that has a String as a key and a pokemon as the value. 
    ```java
    Map<String, Pokemon> trainers = new TreeMap<>();
    ```
3. Add values to the TreeMap. Ask for volunteers from the batch to be some of the trainers and ask what their favorite pokemon are. Be sure to add trainers with names out of alphabetical order. 
    ```java
    trainers.put("William", new Pokemon("Fire", 14, "Charizard"));
	trainers.put("Ash", new Pokemon("Electric", 1, "Pikachu"));
	trainers.put("Brock", new Pokemon("Rock", 35, "Onyx"));
	trainers.put("Misty", new Pokemon("Water", 14, "Staryu"));
	trainers.put("Yuvi", new Pokemon("Psychic", 14, "Alakaza"));
    ```
4. Explain the need for an iterator and get one for the TreeMap. 
    ```java
    Iterator it = trainers.entrySet().iterator();
    ```
5. Create a while loop to iterate over the map printing the key/value pairs in order. 
    ```java
	while (it.hasNext()) {
		Map.Entry pair = (Map.Entry) it.next();
		System.out.println(pair.getKey() + " => " + pair.getValue());
	}
    ```
6. Run the application to show the ordered key/value pairs. 

***TreeMap with Comparator***

1. Create a new class TrainerHelper that implements Comparator with a String generic.
    ```java
    class TrainerHelper implements Comparator<String>
    ```
2. Create a compare method in TrainerHelper that will sort strings in descending order. 
    ```java
	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
    ```
3. Pass in a new TrainerHelper as an argument to the trainers TreeMap when it is initialized in the main method.
    ```java
    Map<String, Pokemon> trainers = new TreeMap<>(new TrainerHelper());
    ```
4. Show that you can iterate over a map using the forEach method and a lambda expression. Make note of Java's ability to infer the return keyword and curly brackets in single line lambda expression.
    ```java
    trainers.forEach((k, v) -> System.out.println(k + " => " + v));
    ```

5. Run the application showing the reverse ordering of the result and how the forEach method and while loop produce the same result. 