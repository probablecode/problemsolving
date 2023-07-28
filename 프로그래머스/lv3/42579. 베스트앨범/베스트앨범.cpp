#include <string>
#include <vector>
#include <unordered_map>
using namespace std;

vector<int> solution(vector<string> genres, vector<int> plays) {
    vector<int> answer;
    unordered_map<string, unordered_map<int, int>> um;
    
    for (int idx = 0; idx < genres.size(); idx++) {
        if (um.find(genres[idx]) == um.end())
        {
            unordered_map<int, int> tmp;
            um[genres[idx]] = tmp;
        }
        (um[genres[idx]])[idx] = plays[idx];
    }
    
    while (!um.empty())
    {
        std::string maxKey;
        int maxValue = std::numeric_limits<int>::min();
        for (const auto& genre : um) {
            int sum = 0;
            for (const auto& song : genre.second)
                sum += song.second;
            if (sum > maxValue) {
                maxValue = sum;
                maxKey = genre.first;
            }
        }
        int album = -1;
        int max = std::numeric_limits<int>::min();
        for (const auto& song : um[maxKey]) {
            if (max < song.second || (max == song.second && song.first < album)) {
                album = song.first;
                max = song.second;
            }
        }
        if (album != -1) {
            answer.push_back(album);
            um[maxKey].erase(album);
        }
        album = -1;
        max = std::numeric_limits<int>::min();
        for (const auto& song : um[maxKey]) {
            if (max < song.second || (max == song.second && song.first < album)) {
                album = song.first;
                max = song.second;
            }
        }
        if (album != -1)
            answer.push_back(album);
        um.erase(maxKey);
    }
    return (answer);
}    
 