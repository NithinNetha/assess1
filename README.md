<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Phase-1 Assessment Project</title>
</head>
<body>
    <h1>LockedMe.com</h1>
    <h3>Table of contents</h3> 
    <ul>
        <li><a href="#Intro">Project Introduction</a></li>
        <li><a href="#ProjectDetails">Project and developer details</a></li>
        <li><a href="#Sprints">Sprints planned</a></li>
        <li><a href="#Flowchart">Flowchart</a></li>
        <li><a href="#TechUsed">Technologies Used</a></li>
        <li><a href="#CoreConcepts">Core Concepts in project</a></li>
        <li><a href="#Conclusion">Conclusion</a></li>
    </ul>
    <h3><a id="Intro">Project Introduction</a></h3>
        <p>This is simple File Handling project which mainly deals with file names rather than file content.</p>
    <h3><a id="ProjectDetails">Project Details</a></h3>
        <p>Project developed by <strong>Palarapu Nithin Kumar</strong> for Phase-1 Assessment email_Id : nithin6425@gmail.com </p>
    <h3><a id="Sprints">Sprints planned</a></h3>
        <p>Sprints are planned and updated using <strong>Trello</strong> click on link given below </p> <br>
        <a href="https://trello.com/b/BcstVBK5/agile-sprint-board" target="_blank">https://trello.com/b/BcstVBK5/agile-sprint-board</a>
        <h4>List of Sprints</h4>
        <ul>
            <li>Draw Flowchart</li>
            <li>Create Welcome Note and Main Menu</li>
            <li>Create Secondary Menu</li>
            <li>AddFile();</li>
            <li>DisplayFile();</li>
            <li>DeleteFile();</li>
            <li>SearchFile();</li>
        </ul>
        <p>All the above sprints are visible in Trello in Sprint Complete TaskCard and each individual Card will have comments for reference.</p>
    <h3><a id="Flowchart">Flowchart</a></h3>
    <img style=" display: block; margin-left: auto;margin-right: auto; width: 70%; " src="https://embed.creately.com/IoPaXVdwWdB?type=svg" alt="image not loading https://embed.creately.com/IoPaXVdwWdB?type=svg try with this link">
    <h3><a id="TechUsed">Technologies Used</a></h3>
        <ul>
            <li>Java</li>
            <li>Eclipse IDE</li>
        </ul>
    <h3><a id="CoreConcepts">Core Concepts in project</a></h3>
            <p>Along  with basic concepts of Java like Output, keyboard input, object, for loop, if statements and more, I also used:-</p>
            <p><strong>File class:</strong> to deal with file operations like creating, deleteing files and retrive file names.</p>
            <p><strong>ArrayList:</strong> to store file names and do operations like Sorting, Display and Searching.</p>
            <p><strong>getPath():</strong> To get the program path and set file path according to it.</p>
            <p><strong>Exceptions:</strong> To catch Exceptions to deal with invalid inputs which helped to avoid unexcpected termination in application</p> 
            <p><strong>switch():</strong> This is used to operate the program in way used choose.</p>
            <p><strong>boolean matches():</strong> This regex method is used to find if file name is in proper format.</p>
            <p><strong>Selection Sort:</strong> to sort file names in ArrayList before displaying.</p>
            <p><strong>Naive String Search Algorithm:</strong> to search file names in ArrayList in way it can find and display files file names even user enters just name without extension.</p>
    <h3><a id="Conclusion">Conclusion</a></h3>
         <p>This LockedMe.com application's unique points are:</p>
        <ul>
            <li> <p>If user gives file name format like .classpath, src, or file. while creating file application will not take it as valid input. File names must be "**.***" format only for creating file.</p></li>
            <li><p> While user wants to search for file along with normal file name format user can give just the file name without extension and application will show us all the files with same name and differnt extension.  </p></li>
        </ul>
        <p>Hence I conclude this application is designed in a way that user no need to worry about invalid inputs or abnormal termination.</p>
    <h4>Thank you</h4>

       
</body>
</html>
