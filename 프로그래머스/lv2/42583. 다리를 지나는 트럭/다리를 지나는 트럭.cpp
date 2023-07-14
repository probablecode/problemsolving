#include <string>
#include <vector>
#include <queue>

using namespace std;

void sequence(queue<int>& q, int weight, int *total_stress)
{
    *total_stress -= q.front();
    *total_stress += weight;
    q.pop();
    q.push(weight);
}

int solution(int bridge_length, int weight, vector<int> truck_weights) {
    int total_stress = 0;
    int answer = 0;
    queue<int> q;
    
    for (int i = 0; i < bridge_length; i++)
        q.push(0);
    vector<int>::iterator it = truck_weights.begin();
    while (it != truck_weights.end())
    {
        int load = 0;
        answer++;
        if (total_stress + *it - q.front() <= weight)
            load = *(it++);
        sequence(q, load, &total_stress);
    }
    return (answer + bridge_length);
}