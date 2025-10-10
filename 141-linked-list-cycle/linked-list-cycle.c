/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    if(head==0) return false;
    int i=0;
    while(head->next!=0&&i<10000){
        head=head->next;
        i++;
    }
    return (head->next!=NULL);
}