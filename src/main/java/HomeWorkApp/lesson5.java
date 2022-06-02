package HomeWorkApp;


public class lesson5 {
    public static void main(String[] args) {
        employer[] employerArray = new employer[5];
        employerArray[0] = new employer("Иванов Иван Иванович", "Директор", "hdjknh@hjk.ww" ,"+79021234567",323, 32);
        employerArray[1] = new employer("Петров Пётр Петрови", "Заместитель директора", "hahkh@hjk.ww" ,"+79021234567",323, 42);
        employerArray[2] = new employer("Гейтс Билл Сидорович", "Ведущий разработчик", "hddhwlqdj@hjk.ww" ,"+79021234567",323, 52);
        employerArray[3] = new employer("Синебрюхов Варфаломей Сидорович", "Аналитик", "qwert@hjk.ww" ,"+79021234567",323, 32);
        employerArray[4] = new employer("Брин Сергей Гуглович", "Разработчик", "asdfg@hjk.ww" ,"+79021234567",323, 52);
        for (int i = 0; i < 4; i++) {
            if (employerArray[i].age > 40) {
                employerArray[i].info();
            }
        }
    }
}
