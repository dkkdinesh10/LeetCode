package org.example.leetcode.alltopics.medium;

public class AddTwoNumbers {

     // Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          int carry=0;
          ListNode node=new ListNode(-1);
          ListNode curr=node;
          while(l1!=null || l2!=null){
              int sum=0;
              if(l1!=null){
                  int v1=l1.val;
                  sum=sum+v1;
                  l1=l1.next;
              }
              if(l2!=null) {
                  int v2 = l2.val;
                  sum=sum+v2;
                  l2=l2.next;
              }
              sum=sum+carry;
              ListNode node1;
               if(sum>9){
                   carry=sum/10;
                   node1=new ListNode(sum%10);
               }else {
                   node1=new ListNode(sum);
                   carry=0;
               }

               curr.next=node1;
               curr=curr.next;
          }
          return node.next;
     }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(3);
        l1.next=l2;
        l2.next=l3;

        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(6);
        ListNode l6=new ListNode(4);
        l4.next=l5;
        l5.next=l6;

        ListNode listNode = addTwoNumbers(l1, l4);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }

    }


}


