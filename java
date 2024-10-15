apt update -y
apt install nginx git -y
systemctl start nginx
git clone https://github.com/devops0014/static-cycle-website-jenkins-docker-.git
cd static-cycle-website-jenkins-docker-.git
cp -r * /var/www/html/
