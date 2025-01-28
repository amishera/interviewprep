The difference lies in the type of the array being passed to `Stream.of`. Let me break this down:

---

### **Why `Stream.of(arrayOfEmps)` Works**
The `arrayOfEmps` is an array of **objects** (`Employee[]`), not primitives. When you call `Stream.of(arrayOfEmps)`, it creates a stream **with the array elements** as individual stream elements.

Here's how `Stream.of` works for an array of objects:
- If you pass an **array of objects** to `Stream.of`, it treats each element of the array as an individual stream element.

For example:
```java
Employee[] arrayOfEmps = {
    new Employee(1, "Jeff Bezos", 100000.0), 
    new Employee(2, "Bill Gates", 200000.0), 
    new Employee(3, "Mark Zuckerberg", 300000.0)
};

Stream<Employee> stream = Stream.of(arrayOfEmps);
```

### **Why It Works**
- `Stream.of(arrayOfEmps)` creates a `Stream<Employee>` because the array elements are of type `Employee`.
- The type of the array is `Employee[]`, which allows `Stream.of` to break the array into individual elements (each `Employee` object).

---

### **Why `Stream.of(ints)` Didn't Work**
When you pass an `int[]` to `Stream.of`, it does **not** treat the `int[]` array as a collection of integers. Instead:
- `Stream.of(ints)` treats the entire `int[]` as a **single element** of the stream.

For example:
```java
int[] ints = {1, 2, 3};
Stream<int[]> stream = Stream.of(ints); // A stream containing one element: the whole array
```
In this case, the stream contains **one element**, which is the `int[]` array itself. This is why trying to use `map(e -> e * 10)` failed—`e` was an array, not an integer.

---

### **Key Differences Between `int[]` and `Employee[]`**
1. **Primitive vs. Object**:
    - `int[]` is a single entity when passed to `Stream.of`.
    - `Employee[]` is an array of objects, so `Stream.of` treats each element as a separate object.

2. **Behavior of `Stream.of`**:
    - For object arrays (`T[]`), `Stream.of` creates a stream of the elements.
    - For primitive arrays, `Stream.of` creates a stream containing the array itself as a single element.

---

### **How to Fix for `int[]`**
To handle primitive arrays (`int[]`), use `Arrays.stream`, which is specifically designed to work with primitive types:
```java
int[] ints = {1, 2, 3};
IntStream intStream = Arrays.stream(ints); // Creates a stream of ints
```

For object arrays (`Employee[]`), `Stream.of` works as expected:
```java
Employee[] employees = {new Employee(...), ...};
Stream<Employee> empStream = Stream.of(employees); // Creates a stream of Employee objects
```

---

### **Summary**
- `Stream.of(arrayOfEmps)` works because `arrayOfEmps` is an object array, and `Stream.of` treats its elements as individual stream elements.
- `Stream.of(ints)` doesn't work as expected because `ints` is a primitive array, and `Stream.of` treats the entire array as a single stream element. Use `Arrays.stream` for primitive arrays instead.