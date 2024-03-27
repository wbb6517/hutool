classDiagram
direction BT
class AbstractCollection~E~
class AbstractList~E~
class AbstractMap~K, V~
class AbstractQueue~E~
class AbstractSequentialList~E~
class AbstractSet~E~
class ArrayDeque~E~
class ArrayList~E~
class Collection~E~ {
<<Interface>>

}
class Deque~E~ {
<<Interface>>

}
class Dictionary~K, V~
class EnumMap~K, V~
class EnumSet~E~
class HashMap~K, V~
class HashSet~E~
class Hashtable~K, V~
class IdentityHashMap~K, V~
class Iterable~T~ {
<<Interface>>

}
class JumboEnumSet~E~
class LinkedHashMap~K, V~
class LinkedHashSet~E~
class LinkedList~E~
class List~E~ {
<<Interface>>

}
class Map~K, V~ {
<<Interface>>

}
class NavigableMap~K, V~ {
<<Interface>>

}
class NavigableSet~E~ {
<<Interface>>

}
class PriorityQueue~E~
class Queue~E~ {
<<Interface>>

}
class RegularEnumSet~E~
class SequencedCollection~E~ {
<<Interface>>

}
class SequencedMap~K, V~ {
<<Interface>>

}
class SequencedSet~E~ {
<<Interface>>

}
class Set~E~ {
<<Interface>>

}
class SortedMap~K, V~ {
<<Interface>>

}
class SortedSet~E~ {
<<Interface>>

}
class Stack~E~
class TreeMap~K, V~
class TreeSet~E~
class Vector~E~
class WeakHashMap~K, V~

AbstractCollection~E~  ..>  Collection~E~ 
AbstractList~E~  -->  AbstractCollection~E~ 
AbstractList~E~  ..>  List~E~ 
AbstractMap~K, V~  ..>  Map~K, V~ 
AbstractQueue~E~  -->  AbstractCollection~E~ 
AbstractQueue~E~  ..>  Queue~E~ 
AbstractSequentialList~E~  -->  AbstractList~E~ 
AbstractSet~E~  -->  AbstractCollection~E~ 
AbstractSet~E~  ..>  Set~E~ 
ArrayDeque~E~  -->  AbstractCollection~E~ 
ArrayDeque~E~  ..>  Deque~E~ 
ArrayList~E~  -->  AbstractList~E~ 
ArrayList~E~  ..>  List~E~ 
Collection~E~  -->  Iterable~T~ 
Deque~E~  -->  Queue~E~ 
Deque~E~  -->  SequencedCollection~E~ 
EnumMap~K, V~  -->  AbstractMap~K, V~ 
EnumSet~E~  -->  AbstractSet~E~ 
HashMap~K, V~  -->  AbstractMap~K, V~ 
HashMap~K, V~  ..>  Map~K, V~ 
HashSet~E~  -->  AbstractSet~E~ 
HashSet~E~  ..>  Set~E~ 
Hashtable~K, V~  -->  Dictionary~K, V~ 
Hashtable~K, V~  ..>  Map~K, V~ 
IdentityHashMap~K, V~  -->  AbstractMap~K, V~ 
IdentityHashMap~K, V~  ..>  Map~K, V~ 
JumboEnumSet~E~  -->  EnumSet~E~ 
LinkedHashMap~K, V~  -->  HashMap~K, V~ 
LinkedHashMap~K, V~  ..>  SequencedMap~K, V~ 
LinkedHashSet~E~  -->  HashSet~E~ 
LinkedHashSet~E~  ..>  SequencedSet~E~ 
LinkedList~E~  -->  AbstractSequentialList~E~ 
LinkedList~E~  ..>  Deque~E~ 
LinkedList~E~  ..>  List~E~ 
List~E~  -->  SequencedCollection~E~ 
NavigableMap~K, V~  -->  SortedMap~K, V~ 
NavigableSet~E~  -->  SortedSet~E~ 
PriorityQueue~E~  -->  AbstractQueue~E~ 
Queue~E~  -->  Collection~E~ 
RegularEnumSet~E~  -->  EnumSet~E~ 
SequencedCollection~E~  -->  Collection~E~ 
SequencedMap~K, V~  -->  Map~K, V~ 
SequencedSet~E~  -->  SequencedCollection~E~ 
SequencedSet~E~  -->  Set~E~ 
Set~E~  -->  Collection~E~ 
SortedMap~K, V~  -->  SequencedMap~K, V~ 
SortedSet~E~  -->  SequencedSet~E~ 
SortedSet~E~  -->  Set~E~ 
Stack~E~  -->  Vector~E~ 
TreeMap~K, V~  -->  AbstractMap~K, V~ 
TreeMap~K, V~  ..>  NavigableMap~K, V~ 
TreeSet~E~  -->  AbstractSet~E~ 
TreeSet~E~  ..>  NavigableSet~E~ 
Vector~E~  -->  AbstractList~E~ 
Vector~E~  ..>  List~E~ 
WeakHashMap~K, V~  -->  AbstractMap~K, V~ 
WeakHashMap~K, V~  ..>  Map~K, V~ 
