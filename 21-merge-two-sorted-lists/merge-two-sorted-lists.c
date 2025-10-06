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
    struct ListNode*temp1=list1;
    struct ListNode*temp2=list2;
    struct ListNode*last=NULL;
    if(temp1->val<=temp2->val){
        last=list1;
        temp1=temp1->next;
    }
    else{
        last=list2;
        temp2=temp2->next;
    }
    while(temp1!=0&&temp2!=0){
        if(temp1->val<=temp2->val){
            last->next=temp1;
            last=temp1;
            temp1=temp1->next;
        }
        else{
            last->next=temp2;
            last=temp2;
            temp2=temp2->next;
        }
    }
    if(temp1==0){
        last->next=temp2;
    }
    if(temp2==0){
        last->next=temp1;
    }
    return (list1->val<=list2->val)? list1:list2;
}
