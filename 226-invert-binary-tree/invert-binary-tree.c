/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

struct TreeNode* invertTree(struct TreeNode* root) {
    struct TreeNode *temp = root;
    if(temp){
        struct TreeNode *temp1 = temp->left;
        temp->left = temp->right;
        temp->right = temp1;
    }
    else{
        return NULL;
    }
    invertTree(root->left);
    invertTree(root->right);
    return temp;
}