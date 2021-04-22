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