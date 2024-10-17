def pro-grafna() {
    sh 'helm repo add stable https://charts.helm.sh/stable'
    sh 'helm repo add prometheus-community https://prometheus-community.github.io/helm-charts'
}
