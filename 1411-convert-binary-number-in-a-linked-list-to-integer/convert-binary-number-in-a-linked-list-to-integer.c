/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    struct ListNode*temp=head;
    int n=0;
    int num=0;
    while(temp!=NULL){
        n++;
        temp=temp->next;
    }
    temp=head;
    n--;
    while(temp!=NULL){
        num=num+(temp->val*(1<<n));
        n--;
        temp=temp->next;
    }
    return num;
}