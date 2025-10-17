void main() {
    List<int> scores = [85,92,76,64,58,99];
    print('학생 성적 목록: $scores');

    List<String> grades = scores.map((score) => getGrade(score)).toList();
    print('학점 결과: $grades');

    double avg = getAverage(socres);
    print('펴ㅑㅇ균 점수: ${avg.toStringAsFixed(2)}');
}

String getGrade(int score) {
    if (score >= 90) return 'A';
    else if (score >= 80) return 'B';
    else if (score >= 70) return 'C';
    else if (score >= 60) return 'D';
    else return 'F';
}

double getAverage(List<int> scores) {
    int total = 0;
    for (int score in scores) {
        total += score;
    }
    return total / scores.length;
}