## Data structure

### Array
1. Insertion order is kept
2. Element access via index
3. Iterable == use for-of loop
4. Size(length) adjusts dynamically
5. Duplicate values are *allowed*
6. Deletion and finding elements can require *extra work*

```js
const alphs = ['a', 'b', 'c'];
console.log(alphs[1]);
console.log(alphs.length);

for (const el of alphs) {
  console.log(el);
}

alphs.push('d');
console.log(alphs.length);

const cIndex = alphs.findIndex((al) => al === 'c');
alphs.splice(2, 1);
console.log(alphs);
```

### Set

1. Insertion order is _not_ stored/memorized
2. Element access and extraction via method
3. Iterable == use for-of loop
4. Size(length) adjusts dynamically
5. Duplicate values are *not* allowed == unique values only
6. Deletion and finding elements is trivial and fast

```js
const ids = new Set();
ids.add('a');
ids.add('b');
ids.add('a');

for (const al of ids) {
  console.log(al);
}

console.log(ids.has('a'));
ids.delete('a');
```

#### Array vs Set

- array
  - Can always use array
  - Must-use if order matters, duplicated are wanted
- set
  - Only usable if order does not matter and you only need unique values
  - Can simplify data access(finding, deletion) compared to arrays

### Object

1. Unordered key-value pairs of data
2. Element access via key (property name)
3. Not iterable (only with for-in)
4. Keys are unique, value are not
5. Keys have to be strings, numbers or symbols
6. Can store data & *functionality* (methods)

```js
const person = { firstName: 'a', age: 21 };
person.firstName = 'b';
delete person.age;
console.log(person);
```

### Map
1. Ordered key-value pairs of data
2. Element access via key
3. Iterable == use for-of loop
4. Keys are unique, values are not
5. Keys can be anything(including refrence values like arrays)
6. Pure data storage optimized for data access

```js
const regex = 'a.*c';
const states = parse(regex);
const exampleStr = 'acsssssc';
const result = test(states, exampleStr);
console.log({ result });

const resultData = new Map();
resultData.set('average', 1.1);
resultData.set('lastResult', null);

const person = { name: 'a' };
resultData.set(person, 10);

for (const val of resultData) {
  console.log(val);
}
// [ 'average', 1.1 ]
// [ 'lastResult', null ]
// [ { name: 'a' }, 10 ]
resultData.get(person);
resultData.delete(person);
resultData.get(person);

```


#### Object vs Map

- objects
  - Very versatile construct and data storage in js
  - Must-use if you want to add extra functionality

- maps
  - Focused on data storage and access
  - Can simplify and imporove data access compared to objects

#### WeakSet & WeakMap

- Variations of Set and Map
- Values and keys are only *weakly referenced*
- Garbage collection can delete values and keys if not used anywhere else in the app

### Linked List

- history

Historically, then main reason was *mermory management*: don't have to specify (occupy) the size in advance.

- why use

useful if you do a lot of *insertions at the beginning of lists* - faster then array at this

|                        | Linked List                        | Arrays |
| ---------------------- | ---------------------------------- | ------ |
| Element Access         | O(n)                               | O(1)   |
| Insertion at End       | with tail:O(1), without tail: O(n) | O(1)   |
| Insertion at beginning | O(1)                               | O(n)   |
| Insertion in Middle    | Search time + O(1)                 | O(n)   |
| Search elements        | O(n)                               | O(n)   |

## Binary Search Tree

### Traversing Trees

- Breadth First(Level Order)

- Depth First
  - Pre-order (root, left, right)
  - In-order (left, root, right)
  - Post-order (left, right, root)
