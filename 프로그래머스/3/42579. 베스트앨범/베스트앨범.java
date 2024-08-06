import java.util.TreeMap;
import java.util.HashMap;

import java.util.Map;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int len = genres.length;
        HashMap<String, Integer> genrePlays = new HashMap<>();
        Map<String, TreeSet<Song>> genreSongs = new HashMap<>();
        
        for (int i = 0; i < len; i++) {
            String genre = genres[i];
            int play = plays[i];
            if (!genreSongs.containsKey(genre)) {
                genrePlays.put(genre, 0);
                genreSongs.put(genre, new TreeSet<Song>());
            }
            int prePlay = genrePlays.get(genre);
            genrePlays.replace(genre, prePlay + play);
            genreSongs.get(genre).add(new Song(i, play)); // add가 맞나?
        }        
        Map<Integer, String> playsGenre = new TreeMap<Integer, String>().descendingMap();
        //        playsGenre = playsGenre.descendingMap();
        for (Map.Entry<String, Integer> entry : genrePlays.entrySet()) {
            playsGenre.put(entry.getValue(), entry.getKey());
        }
        List<Integer> answerList = new ArrayList();
        for (String genre : playsGenre.values()) {
            TreeSet<Song> songs = genreSongs.get(genre);
            answerList.add(songs.pollFirst().index);
            if (!songs.isEmpty()) {
                answerList.add(songs.first().index);
            }
        }
        int answerLen = answerList.size();
        int[] answer = new int[answerLen];
        for (int i = 0; i < answerLen; i++)
            answer[i] = answerList.get(i);
        return answer;
    }
    
    static class Song implements Comparable<Song> {
        public int index;
        public int play;
        
        public Song(int index, int play) {
            this.index = index;
            this.play = play;
        }
        
        @Override
        public int compareTo(Song s) {
            if (this.play < s.play)
                return 1;
            else if (this.play > s.play)
                return -1;
            else if (this.index > s.index)
                return 1;
            return 0;
        }
    }
}