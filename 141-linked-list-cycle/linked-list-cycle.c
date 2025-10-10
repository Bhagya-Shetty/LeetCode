/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    int i=0;
    while(head!=0&&i<10000){
        head=head->next;
        i++;
    }
    return (head!=NULL);
}