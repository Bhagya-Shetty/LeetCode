/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    if(head->next==NULL) return NULL;
    int count=0,i=1;
    struct ListNode*temp;
    temp=head;
    while(temp!=0){
        temp=temp->next;
        count++;
    }
    count/=2;
    temp=head;
    while(i<count){
        temp=temp->next;
        i++;
    }
    temp->next=temp->next->next;
    return head;
}