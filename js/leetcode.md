## LinkedLink

- [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

`dummy` to simplify edge case.

```js
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {

  let dummy = new ListNode();
  dummy.next = head;

  let first = dummy,
      second = dummy,
      count = 0

  while (first.next !== null) {
    if (count === n) {
      second = second.next;
      first = first.next;
    } else {
      first = first.next;
      count++;
    }
  }
  second.next = second.next.next;
  return dummy.next;
};
```

## bfs / dfs
- [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

#### bfs

```js
var maxDepth = function(root) {
 if (root === null) return 0;
 const queue = [root];

 let depth = 0;

 let node = root

 while (queue.length) {

   let length = queue.length;
   for (let i = 0; i < length; i++) {
     node = queue.shift();

     if (node.left) {
       queue.push(node.left)
     }

     if (node.right) {
       queue.push(node.right)
     }

   }
   depth++;
 }
 return depth;
}
```
### dfs

```js
var maxDepth = function(root) {
  if (root === null) return 0;

  let res = 1;
  let depth = 1;

  const dfs = (node) => {
    if (node.left === null && node.right === null) {
      if (depth > res) {
        res = depth;
      }
      return
    }

    if (node.left) {
      depth++;
      dfs(node.left);
      depth--;
    }

    if (node.right) {
      depth++;
      dfs(node.right);
      depth--;
    }
  }

  dfs(root);

  return res;
};
```