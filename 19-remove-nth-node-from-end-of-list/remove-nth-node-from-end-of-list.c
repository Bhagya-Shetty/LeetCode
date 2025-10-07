/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if(head==0) return head;
    struct ListNode*temp,*temp1;
    temp=temp1=head;
    for(int i=0;i<n;i++){
        temp1=temp1->next;
    }
    if(temp1==0){
        head=temp->next;
        return head;
    }
    while(temp1->next!=0){
        temp=temp->next;
        temp1=temp1->next;
    }
    temp->next=temp->next->next;
    return head;
}