# TeamCity Agent Build
```shell
touch Dockerfile

tee Dockerfile <<-'EOF'
ADD file:00dae10e79b05c4e1a3db053a1f85a4f38a39fe85cbbd88d74201a01a7dd59b5 in /
CMD ["bash"]
ENV LANG=en_US.UTF-8 LANGUAGE=en_US:en LC_ALL=en_US.UTF-8 DEBIAN_FRONTEND=noninteractive TZ=Europe/London
RUN apt-get update &&     apt-get install -y --no-install-recommends curl ca-certificates fontconfig locales unzip &&     apt-get install -y python3-venv &&     apt-get clean && rm -rf /var/lib/apt/lists/* &&     echo "en_US.UTF-8 UTF-8" >> /etc/locale.gen &&     locale-gen en_US.UTF-8 &&     rm -rf /var/lib/apt/lists/* &&     useradd -m buildagent
ARG jdkLinuxComponent
ARG jdkLinuxComponentMD5SUM
|2 jdkLinuxComponent=https://corretto.aws/downloads/resources/11.0.15.9.1/amazon-corretto-11.0.15.9.1-linux-x64.tar.gz jdkLinuxComponentMD5SUM=30f9268b8f4c2c2f8c1676611b88aa0d RUN set -eux;     curl -LfsSo /tmp/openjdk.tar.gz ${jdkLinuxComponent};     echo "${jdkLinuxComponentMD5SUM} */tmp/openjdk.tar.gz" | md5sum -c -;     mkdir -p /opt/java/openjdk;     cd /opt/java/openjdk;     tar -xf /tmp/openjdk.tar.gz --strip-components=1;     chown -R root:root /opt/java;     rm -rf /tmp/openjdk.tar.gz;
ENV JAVA_HOME=/opt/java/openjdk JDK_HOME=/opt/java/openjdk PATH=/opt/java/openjdk/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin
|2 jdkLinuxComponent=https://corretto.aws/downloads/resources/11.0.15.9.1/amazon-corretto-11.0.15.9.1-linux-x64.tar.gz jdkLinuxComponentMD5SUM=30f9268b8f4c2c2f8c1676611b88aa0d RUN update-alternatives --install /usr/bin/java java ${JDK_HOME}/bin/java 1 &&     update-alternatives --set java ${JDK_HOME}/bin/java &&     update-alternatives --install /usr/bin/javac javac ${JDK_HOME}/bin/javac 1 &&     update-alternatives --set javac ${JDK_HOME}/bin/javac
ENV CONFIG_FILE=/data/teamcity_agent/conf/buildAgent.properties LANG=C.UTF-8
COPY --chown=buildagent:buildagentfile:18067b403b52c73e848a4574f78e28fd8423f48007f1e1ed08571f7099a1f3d0 in /run-agent.sh
COPY --chown=buildagent:buildagentfile:732abd43b8b1bb427202a6dc120b5dedf37e13121fab27b1f9a0d3e5f3b7d758 in /run-services.sh
COPY --chown=buildagent:buildagentdir:50f89cad0b7866b771e55fd0c17845f20e8eb8bbcee50bce89350ec3b23e6881 in /opt/buildagent
|2 jdkLinuxComponent=https://corretto.aws/downloads/resources/11.0.15.9.1/amazon-corretto-11.0.15.9.1-linux-x64.tar.gz jdkLinuxComponentMD5SUM=30f9268b8f4c2c2f8c1676611b88aa0d RUN chmod +x /home/docker/teamcity_agent_B/opt/buildagent/bin/*.sh &&     chmod +x /run-agent.sh /run-services.sh && sync &&     mkdir -p /data/teamcity_agent/conf &&     chown -R buildagent:buildagent /data/teamcity_agent &&     sed -i -e 's/\r$//' /run-agent.sh &&     sed -i -e 's/\r$//' /run-services.sh
 USER buildagent
|2 jdkLinuxComponent=https://corretto.aws/downloads/resources/11.0.15.9.1/amazon-corretto-11.0.15.9.1-linux-x64.tar.gz jdkLinuxComponentMD5SUM=30f9268b8f4c2c2f8c1676611b88aa0d RUN mkdir -p /home/docker/teamcity_agent_B/opt/buildagent/work &&     mkdir -p /home/docker/teamcity_agent_B/opt/buildagent/system/.teamcity-agent &&     mkdir -p /home/docker/teamcity_agent_B/opt/buildagent/temp &&     mkdir -p /home/docker/teamcity_agent_B/opt/buildagent/plugins &&     mkdir -p /home/docker/teamcity_agent_B/opt/buildagent/logs &&     mkdir -p /home/docker/teamcity_agent_B/opt/buildagent/tools &&     echo >> /home/docker/teamcity_agent_B/opt/buildagent/system/.teamcity-agent/teamcity-agent.xml &&     sed -i -e 's/\r$//' /home/docker/teamcity_agent_B/opt/buildagent/system/.teamcity-agent/teamcity-agent.xml &&     echo >> /home/docker/teamcity_agent_B/opt/buildagent/system/.teamcity-agent/unpacked-plugins.xml &&     sed -i -e 's/\r$//' /home/docker/teamcity_agent_B/opt/buildagent/system/.teamcity-agent/unpacked-plugins.xml
VOLUME [/data/teamcity_agent/conf]
VOLUME [/home/docker/teamcity_agent_B/opt/buildagent/work]
VOLUME [/home/docker/teamcity_agent_B/opt/buildagent/system]
VOLUME [/home/docker/teamcity_agent_B/opt/buildagent/temp]
VOLUME [/home/docker/teamcity_agent_B/opt/buildagent/logs]
VOLUME [/home/docker/teamcity_agent_B/opt/buildagent/tools]
VOLUME [/home/docker/teamcity_agent_B/opt/buildagent/plugins]
CMD ["/run-services.sh"]
USER root
COPY file:56f5b1f92f0c5a52e0375f49893e671815b065b80a6c8c216bd0c7ffccd8ea83 in /services/run-docker.sh
ARG dotnetCoreLinuxComponentVersion
ENV DOTNET_CLI_TELEMETRY_OPTOUT=true DOTNET_SKIP_FIRST_TIME_EXPERIENCE=true ASPNETCORE_URLS=http://+:80 DOTNET_RUNNING_IN_CONTAINER=true DOTNET_USE_POLLING_FILE_WATCHER=true NUGET_XMLDOC_MODE=skip GIT_SSH_VARIANT=ssh DOTNET_SDK_VERSION=
ARG dotnetLinuxComponent
ARG dotnetLinuxComponentSHA512
ARG dotnetLinuxComponent_31
ARG dotnetLinuxComponentSHA512_31
ARG dotnetLinuxComponent_50
ARG dotnetLinuxComponentSHA512_50
ARG dotnetLibs
ARG gitLinuxComponentVersion
ARG gitLFSLinuxComponentVersion
ARG dockerComposeLinuxComponentVersion
ARG dockerLinuxComponentVersion
ARG containerdIoLinuxComponentVersion
ARG p4Version
|13 containerdIoLinuxComponentVersion=1.4.12-1 dockerComposeLinuxComponentVersion=1.28.5 dockerLinuxComponentVersion=5:20.10.12~3-0~ubuntu dotnetLibs=libc6 libgcc1 libgssapi-krb5-2 libicu66 libssl1.1 libstdc++6 zlib1g dotnetLinuxComponent=https://dotnetcli.blob.core.windows.net/dotnet/Sdk/6.0.100/dotnet-sdk-6.0.100-linux-x64.tar.gz dotnetLinuxComponentSHA512=cb0d174a79d6294c302261b645dba6a479da8f7cf6c1fe15ae6998bc09c5e0baec810822f9e0104e84b0efd51fdc0333306cb2a0a6fcdbaf515a8ad8cf1af25b dotnetLinuxComponentSHA512_31=cc4b2fef46e94df88bf0fc11cb15439e79bd48da524561dffde80d3cd6db218133468ad2f6785803cf0c13f000d95ff71eb258cec76dd8eb809676ec1cb38fac dotnetLinuxComponentSHA512_50=32b5f86db3b1d4c21e3cf616d22f0e4a7374385dac0cf03cdebf3520dcf846460d9677ec1829a180920740a0237d64f6eaa2421d036a67f4fe9fb15d4f6b1db9 dotnetLinuxComponent_31=https://dotnetcli.azureedge.net/dotnet/Runtime/3.1.21/dotnet-runtime-3.1.21-linux-x64.tar.gz dotnetLinuxComponent_50=https://dotnetcli.azureedge.net/dotnet/Runtime/5.0.12/dotnet-runtime-5.0.12-linux-x64.tar.gz gitLFSLinuxComponentVersion=2.9.2-1 gitLinuxComponentVersion=1:2.37.0-0ppa1~ubuntu20.04.1 p4Version=2021.2-2273812 RUN apt-get update &&     apt-get install -y mercurial apt-transport-https software-properties-common &&     add-apt-repository ppa:git-core/ppa -y &&     apt-get install -y git=${gitLinuxComponentVersion} git-lfs=${gitLFSLinuxComponentVersion} &&     git lfs install --system &&     apt-get clean && rm -rf /var/lib/apt/lists/* &&     apt-key adv --fetch-keys https://package.perforce.com/perforce.pubkey &&     (. /etc/os-release &&       echo "deb http://package.perforce.com/apt/$ID $VERSION_CODENAME release" >       /etc/apt/sources.list.d/perforce.list ) &&     apt-get update &&     (. /etc/os-release && apt-get install -y helix-cli-base="${p4Version}~$VERSION_CODENAME" helix-cli="${p4Version}~$VERSION_CODENAME" ) &&     apt-get clean && rm -rf /var/lib/apt/lists/* &&     curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add - &&     add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" &&     apt-cache policy docker-ce &&     apt-get update &&     apt-get install -y  docker-ce=${dockerLinuxComponentVersion}-$(lsb_release -cs)                         docker-ce-cli=${dockerLinuxComponentVersion}-$(lsb_release -cs)                         containerd.io:amd64=${containerdIoLinuxComponentVersion}                         systemd &&     systemctl disable docker &&     sed -i -e 's/\r$//' /services/run-docker.sh &&     curl -SL "https://github.com/docker/compose/releases/download/${dockerComposeLinuxComponentVersion}/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose && chmod +x /usr/local/bin/docker-compose &&     apt-get install -y --no-install-recommends ${dotnetLibs} &&     apt-get clean && rm -rf /var/lib/apt/lists/* &&     mkdir -p /usr/share/dotnet &&     curl -SL ${dotnetLinuxComponent_31} --output /tmp/dotnet.tar.gz &&     echo "${dotnetLinuxComponentSHA512_31} */tmp/dotnet.tar.gz" | sha512sum -c -;     tar -zxf /tmp/dotnet.tar.gz -C /usr/share/dotnet &&     rm /tmp/dotnet.tar.gz &&     find /usr/share/dotnet -name "*.lzma" -type f -delete &&     curl -SL ${dotnetLinuxComponent_50} --output /tmp/dotnet.tar.gz &&     echo "${dotnetLinuxComponentSHA512_50} */tmp/dotnet.tar.gz" | sha512sum -c -;     tar -zxf /tmp/dotnet.tar.gz -C /usr/share/dotnet &&     rm /tmp/dotnet.tar.gz &&     find /usr/share/dotnet -name "*.lzma" -type f -delete &&     curl -SL ${dotnetLinuxComponent} --output /tmp/dotnet.tar.gz &&     echo "${dotnetLinuxComponentSHA512} */tmp/dotnet.tar.gz" | sha512sum -c -;     tar -zxf /tmp/dotnet.tar.gz -C /usr/share/dotnet &&     rm /tmp/dotnet.tar.gz &&     find /usr/share/dotnet -name "*.lzma" -type f -delete &&     ln -s /usr/share/dotnet/dotnet /usr/bin/dotnet &&     dotnet help &&     dotnet --info &&     apt-get clean && rm -rf /var/lib/apt/lists/* &&     chown -R buildagent:buildagent /services &&     usermod -aG docker buildagent
VOLUME [/var/lib/docker]
USER buildagent
EOF
```