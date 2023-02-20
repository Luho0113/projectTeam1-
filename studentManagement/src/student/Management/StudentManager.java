package student.Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

	// ��ü ����
	Data data = new Data();

	// �޼ҵ� ȣ��
	List<Student> studentList = data.getStudentList();
	List<Lecture> lectureList = data.getLectureList();

	// ����Ʈ ����
	// List<Student> studentArray = new ArrayList<Student>();

	Scanner sc = new Scanner(System.in);
	int menuSelect = 0;
	boolean flag = true;
	String searchName;
	
	
	//��ü ���� �޴� ���� �޼ҵ�
	void studentRun() {

		while (flag) {

			System.out.println("-----------------------------------------------");
			System.out.printf("%-8s%-8s%-8s%-8s%-8s\n", "1. �л�����", "2. ���ǰ���", "3. ��������", "4. ������", "5. ����");
			System.out.println("-----------------------------------------------");
			System.out.print("�޴� ���� > ");
			menuSelect = sc.nextInt();
			sc.nextLine();

			switch (menuSelect) {
				case 1: {
					System.out.println("�л����� �޴��� �����߽��ϴ�.");
					studentManage();
					break;
				}
				case 2: {
					System.out.println("���ǰ��� �޴��� �����߽��ϴ�.");
					// classManage();
					break;
				}
				case 3: {
					System.out.println("�������� �޴��� �����߽��ϴ�.");
					new Score();
					// gradesManage();
					break;
				}
				case 4: {
					System.out.println("������ �޴��� �����߽��ϴ�.");
					// attendanceManage();
					break;
				}
				case 5: {
					System.out.println("���α׷� ����!");
					flag = false;
					break;
				}
				default: {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
			}
		}
	} // studentRun end
	
	
	//�л����� �޴��� �޼ҵ�
	void studentManage() {
		Boolean flag = true;
		
		while (flag) {

			System.out.println("------------------------------------------------------");
			System.out.println("1.�л��˻� 2.�л���� 3.�л� �������� 4.�л����� 5.����ȭ������");
			System.out.println("------------------------------------------------------");
			System.out.print("�޴� ���� > ");
			menuSelect = sc.nextInt();
			sc.nextLine();

			boolean run = true;
			String input; //�߰��˻��� ����
			boolean isThere; //��ϵ��� ���� �׸� �˻��?

			while (run) {

				switch (menuSelect) {
				case 1: // �л� �˻�
					isThere = false;
					System.out.print("�л� �̸��� �Է����ּ���. > ");
					searchName = sc.nextLine();
					
					//searchName�� ����Ʈ�� �ִٸ� ���� ���
					for (int i = 0; i < studentList.size(); i++) {

						if (searchName.equals(studentList.get(i).getStudentName())) {
							System.out.println("�̸�: " + studentList.get(i).getStudentName());
							System.out.println("��ȭ��ȣ: " + studentList.get(i).getPhoneNum());
							System.out.println("��������: " + studentList.get(i).getSubjectName());
							System.out.println("��: " + studentList.get(i).getClassName());
							isThere = true;

						}

					}

					if (!isThere) {
						System.out.println("��ϵ��� ���� �л��Դϴ�.\n�ٽ� �Է����ּ���.");
						break;
					}
					
					System.out.println("�߰� �˻� �Ͻðڽ��ϱ�? (Y/N)");
					input = (sc.nextLine()).toUpperCase();
					if (input.equals("Y")) {
						run = true;
					}
					if (input.equals("N")) {
						// searchOk = false;
						run = false;
						break;
					}

					break;

				case 2: // �л� ���
					System.out.print("����� �л� �̸� > ");
					String inputName = sc.nextLine();
					System.out.print("��ȭ��ȣ ��� > ");
					String inputPhone = sc.nextLine();
					System.out.print("�������� ��� > ");
					String inputSub = sc.nextLine();
					System.out.print("����� �� > ");
					String inputClass = sc.nextLine();

					studentList.add(new Student(inputName, inputPhone, inputClass, inputSub));

					System.out.println("�л� ������ ��ϵǾ����ϴ�.");
					break;

				case 3: // �л� ����
					
					Scanner ms = new Scanner(System.in); //������ ��ȭ��ȣ�� �Է¹��� ��ĳ��
					isThere = false;
					
					System.out.print("�л� �̸��� �Է��ϼ���. > ");
					searchName = sc.nextLine();
					
					
					for(int i = 0; i<studentList.size(); i++) {
						String privNum;//���� �� ��ȭ��ȣ
						privNum = studentList.get(i).getPhoneNum(); //���� ��ȭ��ȣ�� ������ ���� ����
						
						if (searchName.equals(studentList.get(i).getStudentName())) {
							System.out.print("������ ��ȭ��ȣ�� �Է��ϼ���. > ");
							studentList.get(i).setPhoneNum(ms.nextLine());
							System.out.println("��ȭ��ȣ�� " + privNum + "���� " +studentList.get(i).getPhoneNum() + "���� ����Ǿ����ϴ�.");
							isThere = true;
						} 
						
					}
					if(!isThere) {
						System.out.println("��ϵ��� ���� �л��Դϴ�.\n�ٽ� �Է����ּ���.");
						break;
					}
					
					System.out.println("�� ���� �Ͻðڽ��ϱ�? (Y/N)");
					input = (sc.nextLine()).toUpperCase();
					if (input.equals("Y")) {
						run = true;
					}
					if (input.equals("N")) {
						run = false;
						break;
					}
					break;

				case 4: // �л� ����
					
					
					System.out.print("������ �л��� �̸��� �Է����ּ���. > ");
					String delStudent = sc.nextLine();
					isThere = false;
					for (int i = 0; i < studentList.size(); i++) {
						
						
						if(studentList.get(i).studentName.equals(delStudent)) {
							
							studentList.remove(i);
							
							System.out.println("���� �����Ͻðڽ��ϱ�? (Y/N)");
							input = (sc.nextLine()).toUpperCase();
							
							if (input.equals("Y")) {
								System.out.println(delStudent + " �л��� ������ �����Ǿ����ϴ�.");
								isThere = true;
								run = false;
								break;
							}
							else if (input.equals("N")) {
								System.out.println("�޴� �������� ���ư��ϴ�.");
								isThere = true;
								run = false;
								break;
							}
							
							break;
						} 
						
						
					}
					if (!isThere){
						System.out.println("��ϵ��� ���� �л��Դϴ�.\n�ٽ� �Է����ּ���.");
						break;
					}

					break;

				case 5: // ���� ȭ������
					System.out.println("���� ȭ������ ���ư��ϴ�.");
					run = false;
					break;

				default:
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
				} // switch ��
			}
		}
	}// studentManage end

}