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
## dp

- [Jump Game](https://leetcode.com/problems/jump-game/)

#### dp: up down

```js
var canJump = function(nums) {

 /** dp: Top Down */
 const maxLength = nums.length;
 const dp = Array(maxLength).fill(0);
 dp[maxLength - 1] = 1;

 const dfs = (position) => {
   if (dp[position] === 1) {
     return true;
   } else if (dp[position] === -1) {
     return false;
   }

   const maxJump = Math.min(position + nums[position], maxLength - 1);

   for (let i = position + 1; i <= maxJump; i++) {
     if (dfs(i)) {
       dp[position] = 1;
       return true;
     }
   }

   dp[position] = -1;
   return false;
 }

 return dfs(0);
}
```

#### dp: bottom up

```js
var canJump = function(nums) {
  const maxLength = nums.length;
  const dp = Array(maxLength).fill(0);
  dp[maxLength - 1] = 1;

  for (let i = maxLength - 2; i >= 0; i--) {
    const maxJump = Math.min(i + nums[i], maxLength - 1);
    for (let j = i + 1; j <= maxJump; j++) {
      if (dp[j] === 1) {
        dp[i] = 1;
        break;
      }
    }
  }
  return dp[0] === 1 ? true: false;
}
```

#### greedy

```js
var canJump = function(nums) {
  let maxJump = nums.length - 1;

  for (let i = nums.length - 2; i >= 0; i--) {
    if (i + nums[i] >= maxJump) {
      maxJump = i
    }
  }
  return maxJump == 0;
}
```