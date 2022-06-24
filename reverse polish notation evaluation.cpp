class Solution {
public:
    
    int evaluate(int v1,int v2,string e){
        
        if(e=="+"){
            return v1+v2;
        }else if(e=="-"){
            return v1-v2;
        }else if(e=="*"){
            return v1*v2;
        }else if(e=="/"){
            return v1/v2;
        }
        return 0;
    }
    
    int evalRPN(vector<string>& tokens) {
        stack<int> operand;
        stack<string>op;
        
        for(string tk:tokens)
        {
            if(tk=="+" || tk =="-" || tk=="*"||tk=="/"){
                int v2=operand.top();
                operand.pop();
                int v1=operand.top();
                operand.pop();
                int val=evaluate(v1,v2,tk);
                operand.push(val);
            }else
            {
                operand.push(stoi(tk));
            }
        }
        
        return operand.top();
        
    }
};
