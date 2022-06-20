package com.voidmain.dao;

import java.util.List;

import com.voidmain.pojo.Job;
import com.voidmain.pojo.Comment;
import com.voidmain.pojo.Company;
import com.voidmain.pojo.Login;
import com.voidmain.pojo.Notification;
import com.voidmain.pojo.Notification2;
import com.voidmain.pojo.Question;
import com.voidmain.pojo.Student;
import com.voidmain.pojo.JobApplication;
import com.voidmain.pojo.JobApplication3;
import com.voidmain.pojo.Senior;

public class HibernateDAO {

	public static String isValidUser(String username,String password)
	{
		String result="0";

		Login login=getLoginById(username);

		if(login!=null && login.getPassword().equals(password))
		{
			result=login.getRole();
		}

		return result;
	}

	public static boolean isUserRegistred(String username)
	{
		boolean isRegistred=false;

		for(Login login : getLogins())
		{
			if(login.getUsername().toLowerCase().equals(username.toLowerCase()))
			{
				isRegistred=true;

				break;
			}
		}

		return isRegistred;
	}

	//================================================================================

	public static Login getLoginById(String username)
	{
		return (Login)HibernateTemplate.getObject(Login.class,username);
	}

	public static int deleteLogin(String username)
	{
		return HibernateTemplate.deleteObject(Login.class,username);
	}

	public static List<Login> getLogins()
	{
		List<Login> logins=(List)HibernateTemplate.getObjectListByQuery("From Login");

		return logins;
	}

	//============================================================================

	public static Senior getSeniorById(String id)
	{
		return (Senior)HibernateTemplate.getObject(Senior.class,id);
	}

	public static int deleteSenior(String id)
	{
		return HibernateTemplate.deleteObject(Senior.class,id);
	}

	public static List<Senior> getSeniors()
	{
		List<Senior> seniors=(List)HibernateTemplate.getObjectListByQuery("From Senior");

		return seniors;
	}

	//=========================================================================

	public static Company getCompanyById(String id)
	{
		return (Company)HibernateTemplate.getObject(Company.class,id);
	}

	public static int deleteCompany(String id)
	{
		return HibernateTemplate.deleteObject(Company.class,id);
	}

	public static List<Company> getCompanys()
	{
		List<Company> companys=(List)HibernateTemplate.getObjectListByQuery("From Company");

		return companys;
	}

	//================================================================================

	public static Student getStudentById(String id)
	{
		return (Student)HibernateTemplate.getObject(Student.class,id);
	}

	public static int deleteStudent(String id)
	{
		return HibernateTemplate.deleteObject(Student.class,id);
	}

	public static List<Student> getStudents()
	{
		List<Student> students=(List)HibernateTemplate.getObjectListByQuery("From Student");

		return students;
	}

	//================================================================================

	public static Job getJobById(int id)
	{
		return (Job)HibernateTemplate.getObject(Job.class,id);
	}

	public static int deleteJob(int id)
	{
		return HibernateTemplate.deleteObject(Job.class,id);
	}

	public static List<Job> getJobs()
	{
		List<Job> jobs=(List)HibernateTemplate.getObjectListByQuery("From Job");

		return jobs;
	}

	//================================================================================

	public static JobApplication getJobApplicationById(int id)
	{
		return (JobApplication)HibernateTemplate.getObject(JobApplication.class,id);
	}

	public static int deleteJobApplication(int id)
	{
		return HibernateTemplate.deleteObject(JobApplication.class,id);
	}

	public static List<JobApplication> getJobApplications()
	{
		List<JobApplication> jobApplications=(List)HibernateTemplate.getObjectListByQuery("From JobApplication");

		return jobApplications;
	}

	//================================================================================

	public static Question getQuestionById(int id)
	{
		return (Question)HibernateTemplate.getObject(Question.class,id);
	}

	public static int deleteQuestion(int id)
	{
		return HibernateTemplate.deleteObject(Question.class,id);
	}

	public static List<Question> getQuestions()
	{
		List<Question> questions=(List)HibernateTemplate.getObjectListByQuery("From Question");

		return questions;
	}

	//================================================================================

	public static Notification getNotificationById(int id)
	{
		return (Notification)HibernateTemplate.getObject(Notification.class,id);
	}

	public static int deleteNotification(int id)
	{
		return HibernateTemplate.deleteObject(Notification.class,id);
	}

	public static List<Notification> getNotifications()
	{
		List<Notification> notifications=(List)HibernateTemplate.getObjectListByQuery("From Notification");

		return notifications;
	}

	//================================================================================
	public static Notification2 getNotification2ById(int id)
	{
		return (Notification2)HibernateTemplate.getObject(Notification2.class,id);
	}

	public static int deleteNotification2(int id)
	{
		return HibernateTemplate.deleteObject(Notification2.class,id);
	}

	public static List<Notification2> getNotifications2()
	{
		List<Notification2> notifications2=(List)HibernateTemplate.getObjectListByQuery("From Notification2");

		return notifications2;
	}
	//================================================================================

	public static Comment getCommentById(int id)
	{
		return (Comment)HibernateTemplate.getObject(Comment.class,id);
	}

	public static int deleteComment(int id)
	{
		return HibernateTemplate.deleteObject(Comment.class,id);
	}

	public static List<Comment> getComments()
	{
		List<Comment> comments=(List)HibernateTemplate.getObjectListByQuery("From Comment");

		return comments;
	}


//================================================================================

public static JobApplication3 getJobApplication3ById(int id)
{
	return (JobApplication3)HibernateTemplate.getObject(JobApplication3.class,id);
}

public static int deleteJobApplication3(int id)
{
	return HibernateTemplate.deleteObject(JobApplication3.class,id);
}

public static List<JobApplication3> getJobApplications3()
{
	List<JobApplication3> jobApplications3=(List)HibernateTemplate.getObjectListByQuery("From JobApplication3");

	return jobApplications3;
}
}


