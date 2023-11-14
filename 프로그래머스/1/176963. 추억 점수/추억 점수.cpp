#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<string> name, vector<int> yearning, vector<vector<string>> photo) {
    vector<int> answer;
    
    for (vector<vector<string>>::iterator it = photo.begin(); it != photo.end(); it++)
    {
        vector<string> &photo_= *it;
        int sum = 0;
        int cnt = 0;
        for (int idx = 0; idx < name.size(); idx++)
        {
            for (vector<string>::iterator it_ = photo_.begin(); it_ != photo_.end(); it_++)
            {
                if (name[idx] == *it_)
                {
                    sum += yearning[idx];
                    cnt++;
                    break;
                }
            }
            if (cnt == it->size())
                break;
        }
        answer.push_back(sum);
    }
    return answer;
}