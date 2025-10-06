/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    if(list1==0) return list2;
    if(list2==0) return list1;
    struct ListNode*head=NULL,*last=NULL;
    if(list1->val<=list2->val){
        head=last=list1;
        list1=list1->next;
    }
    else{
        head=last=list2;
        list2=list2->next;
    }
    while(list1!=0&&list2!=0){
        if(list1->val<=list2->val){
            last->next=list1;
            last=list1;
            list1=list1->next;
        }
        else{
            last->next=list2;
            last=list2;
            list2=list2->next;
        }
    }
    if(list1==0){
        last->next=list2;
    }
    if(list2==0){
        last->next=list1;
    }
    return head;
}
