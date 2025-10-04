/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    while(head!=NULL&&head->val==val) {
        head=head->next;
    }
    if(head==NULL) return NULL;
    struct ListNode*temp=head;
    struct ListNode*temp1=head->next;
    while (temp1!=NULL) {
        if(temp1->val==val) {
            temp->next=temp1->next; 
        }else{
            temp=temp1;              
        }
        temp1=temp1->next;           
    }
    return head;
}

