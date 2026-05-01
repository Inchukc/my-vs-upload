<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Submission</title>
    <link rel="stylesheet" href="style1.css">
</head>
<body>
    <div class="container">
        <h2>Form Submitted Successfully!</h2>
        <p><strong>Name:</strong><?php echo htmlspecialchars($_POST['name']);?></p>
        <p><strong>Email:</strong><?php echo htmlspecialchars($_POST['email']);?></p>
        <p><strong>Phone:</strong><?php echo htmlspecialchars($_POST['phone']);?></p>
        <p><strong>Gender:</strong><?php echo htmlspecialchars($_POST['gender']);?></p>
        <p><strong>Course:</strong><?php echo htmlspecialchars($_POST['course']);?></p>
</div>
    
</body>
</html>