#include <stdio.h>  
#include <stdlib.h>  
#include <ctype.h>  

// �����ض��ľ���  
#pragma warning(disable: 4996)  

// ��������  
int count_characters(FILE* file);
int count_words(FILE* file);

int main(int argc, char* argv[]) {
    FILE* file;
    char* filename;
    char parameter;

    if (argc != 3) {
        printf("Usage: %s [-c|-w] [input_file_name]\n", argv[0]);
        return 1;
    }

    // �������Ƿ��� '-' ��ͷ  
    if (argv[1][0] != '-') {
        printf("Invalid parameter format: %s\n", argv[1]);
        return 1;
    }

    // ��ȡ����-c��-w  
    parameter = argv[1][1];
    filename = argv[2];     // ��ȡ�ļ���  

    // ���ļ�  
    file = fopen(filename, "r");
    if (file == NULL) {
        perror("Error opening file");
        return 1;
    }

    // ���ݲ���ִ�в�ͬ��ͳ��  
    if (parameter == 'c') {
        int characters = count_characters(file);
        printf("�ַ�����%d\n", characters);
    }
    else if (parameter == 'w') {
        int words = count_words(file);
        printf("��������%d\n", words);
    }
    else {
        printf("Invalid parameter: %c\n", parameter);
    }

    // �ر��ļ�  
    fclose(file);
    return 0;
}

// ͳ���ַ����ĺ���  
int count_characters(FILE* file) {
    int count = 0;
    char ch;

    while ((ch = fgetc(file)) != EOF) {
        count++;
    }

    // �Ƴ�rewind���ã���Ϊ����������Ҫ��ȡ���ļ�  
    // rewind(file);  1

    return count;
}

// ͳ�Ƶ������ĺ���  
int count_words(FILE* file) {
    int count = 0;
    int in_word = 0;
    char ch;

    while ((ch = fgetc(file)) != EOF) {
        // ��������ո񡢶��Ż��з������ҵ�ǰ�ڵ����У������ӵ��ʼ���  
        if ((isspace(ch) || ch == ',') && in_word) {
            count++;
            in_word = 0;
        }
        // ��������ǿո��ַ�������뵥��״̬  
        else if (!isspace(ch) && ch != ',') {
            in_word = 1;
        }
    }

    // �Ƴ�rewind���ã���Ϊ����������Ҫ��ȡ���ļ�  
    // ���һ�������Ѿ���ѭ���м���  
    // rewind(file);  

    return count;
}
