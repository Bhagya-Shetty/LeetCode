/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if(!head||!head->next||k==0) return head;
    struct ListNode*temp=head;
    int count=1,i=0;
    while(temp->next!=0){
        temp=temp->next;
        count++;
    }
    k%=count;
    if(k==0) return head;
    temp->next=head;
    temp=head;
    while(i<(count-k-1)){
        temp=temp->next;
        i++;
    }
    head=temp->next;
    temp->next=0;   
    return head;
}